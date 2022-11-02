class User {
  private int userid; 
  private String username;
  
  void setUserID(int uid) {
    userid = uid; 
  }
  
  void setUserName(String name) {
    username = name; 
  }
  
  int getUserID() {
    return this.userid;
  }
  
  String getUserName() {
    return this.username;
  }
  
  static void main(String[] arg) {
    User user01 = new User();
    user01.setUserID(1);
    user01.setUserName("DummyUser");
    
    println(user01.getUserID() + " : " + user01.getUserName());
  }
    
}
