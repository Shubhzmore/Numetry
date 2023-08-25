package com.user.user_service1.entity;

public class Email {
	
	 	private Long id;

	    private String toAddress;
	    private String subject;
	    private Long userId;
	    
		public Email(Long id, String toAddress, String subject, Long userId) {
			
			this.id = id;
			this.toAddress = toAddress;
			this.subject = subject;
			this.userId = userId;
		}

		public Email() {
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getToAddress() {
			return toAddress;
		}

		public void setToAddress(String toAddress) {
			this.toAddress = toAddress;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}
	    
}	