package com.timeline.vo;

public class PostUserVo {
	private int userNo;
	private String userId;
	private String userName;
	private String userRepImg;
	private boolean isFollowed;
	private int followings;
	private int followers;
	
	public PostUserVo() {
		
	}
	
	public PostUserVo(int userNo, String userId, String userName, String userRepImg, boolean isFollowed, int followings,
			int followers) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userName = userName;
		this.userRepImg = userRepImg;
		this.isFollowed = isFollowed;
		this.followings = followings;
		this.followers = followers;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRepImg() {
		return userRepImg;
	}

	public void setUserRepImg(String userRepImg) {
		this.userRepImg = userRepImg;
	}

	public boolean isFollowed() {
		return isFollowed;
	}

	public void setFollowed(boolean isFollowed) {
		this.isFollowed = isFollowed;
	}
	
	public int getFollowings() {
		return followings;
	}

	public void setFollowings(int followings) {
		this.followings = followings;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	@Override
	public String toString() {
		return "PostUserVo [userNo=" + userNo + ", userId=" + userId + ", userName=" + userName + ", userRepImg="
				+ userRepImg + ", isFollowed=" + isFollowed + ", followings=" + followings + ", followers=" + followers
				+ "]";
	}

}
