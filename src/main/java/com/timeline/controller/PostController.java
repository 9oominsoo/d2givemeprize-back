package com.timeline.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.timeline.service.PostService;
import com.timeline.vo.PostVo;
import com.timeline.vo.PostfileVo;

@RestController
@CrossOrigin
@RequestMapping(value="/post")
public class PostController {
	
	@Autowired
	private PostService service;
	
	@RequestMapping(value="/writeform", method=RequestMethod.GET)
	public ModelAndView loginTestPage() {
		ModelAndView mav = new ModelAndView("/WEB-INF/views/posts/timeline.jsp");
		
		return mav;
	}
	
	//게시글 작성
	@RequestMapping(method=RequestMethod.POST)
	public int writePheed(@RequestBody List<Object> multiParam, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("write pheed...");
		
		return service.writePheed(request, response, multiParam);
	}
	
	//모든 게시글 로드
	@RequestMapping(value="/allPheed", method=RequestMethod.GET)
	public List<PostVo> loadPheed(){
		System.out.println("load pheed...");
		
		return service.loadPheed();
	}
	
	//유저별 게시글 로드(following 중인 친구 게시글 로드)
	@RequestMapping(method=RequestMethod.GET)
	public List<PostVo> loadMyPheed(HttpServletRequest request, HttpServletResponse response) throws Exception{
		System.out.println("load my pheed...");
		
		return service.loadMyPheed(request, response);
	}

	//게시글 상세보기
	@RequestMapping(value="/{postno}", method=RequestMethod.GET)
	public Map<String, Object> detailPheed(@PathVariable("postno") int postNo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("load distinct pheed No " + postNo + "...");
		
		return service.detailPheed(request, response, postNo);
	}
	
	//게시글 전체 사진 로딩 
	@RequestMapping(value="/{postno}/loadPheedImg", method=RequestMethod.GET)
	public List<PostfileVo> loadPheedImg(@PathVariable("postno") int postNo){
		return service.loadPheedImg(postNo);
	}
		
	//게시글 좋아요
	@RequestMapping(value="/{postno}", method=RequestMethod.PUT)
	public int likeTogglePheed(@PathVariable("postno") int postNo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("like/unlike pheed No " + postNo + "...");
		
		return service.likeTogglePheed(request, response, postNo);
	}
	
}
