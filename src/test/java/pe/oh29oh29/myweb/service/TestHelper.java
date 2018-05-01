package pe.oh29oh29.myweb.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import pe.oh29oh29.myweb.model.Comment;
import pe.oh29oh29.myweb.model.Member;
import pe.oh29oh29.myweb.model.Post;
import pe.oh29oh29.myweb.model.PostView;

public class TestHelper {
	
	private MemberService memberService;
	private PostService postService;
	private CommentService commentService;
	
	TestHelper(MemberService memberService) {
		this.memberService = memberService;
	}
	TestHelper(MemberService memberService, PostService postService) {
		this.memberService = memberService;
		this.postService = postService;
	}
	TestHelper(MemberService memberService, CommentService commentService) {
		this.memberService = memberService;
		this.commentService = commentService;
	}
	TestHelper(MemberService memberService, PostService postService, CommentService commentService) {
		this.memberService = memberService;
		this.postService = postService;
		this.commentService = commentService;
	}
	
	/**
	 * @date	: 2018. 4. 10.
	 * @TODO	: 회원 생성
	 */
	public Member signUpMember() {
		Member member = new Member();
		member.setId("Member아이디");
		member.setName("Member이름");
		member.setEmail("Member이메일");
		memberService.signUpMember(member);
		
		// 검증
		List<Member> members = memberService.readAllMembers();
		assertEquals(1, members.size());
		Member member2 = members.get(0);
		assertEquals(member.getId(), member2.getId());
		assertEquals(member.getName(), member2.getName());
		assertEquals(member.getEmail(), member2.getEmail());
		
		return member2;
	}
	
	
	/**
	 * @date	: 2018. 4. 12.
	 * @TODO	: 포스트 작성
	 */
	public Post writePost(String memberIdx) {
		Post post = new Post();
		post.setMemberIdx(memberIdx);
		post.setTitle("Post타이틀");
		post.setContents("Post내용");
		postService.writePost(post);
		
		return post;
	}
	
	/**
	 * @date	: 2018. 4. 12.
	 * @TODO	: 포스트 작성
	 */
	public Post writePostWithRelation(String memberIdx, String categoryIdx, List<String> relatedPostIdxList) {
		Post post = new Post();
		post.setMemberIdx(memberIdx);
		post.setTitle("Post타이틀");
		post.setContents("Post내용");
		postService.writePost(post);
		
		// 검증
		List<PostView> postsView = postService.getPosts(categoryIdx);
		assertTrue(postsView.size() > 0);
		PostView postView = postsView.get(0);
		assertEquals(post.getTitle(), postView.getTitle());
		assertEquals(post.getContents(), postView.getContents());
		assertNotNull(postView.getRegDate());
		
		Post post2 = post;
		post2.setIdx(postView.getIdx());
		post2.setRegDate(postView.getRegDate());
		
		return post2;
	}
	
	/**
	 * @date	: 2018. 4. 12.
	 * @TODO	: 코멘트 작성
	 */
	public Comment writeComment(String memberIdx, String postIdx) {
		Comment comment = new Comment();
		comment.setMemberIdx(memberIdx);
		comment.setPostIdx(postIdx);
		comment.setContents("Comment내용");
		commentService.writeComment(comment);
		
		List<Comment> comments = commentService.readComments(postIdx);
		assertEquals(1, comments.size());
		Comment comment2 = comments.get(0);
		assertNotNull(comment2.getIdx());
		assertEquals(comment.getMemberIdx(), comment2.getMemberIdx());
		assertEquals(comment.getPostIdx(), comment2.getPostIdx());
		assertEquals(comment.getContents(), comment2.getContents());
		assertNotNull(comment2.getRegDate());
		
		return comment;
	}
}
