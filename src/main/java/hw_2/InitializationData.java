package hw_2;

public class InitializationData extends Information implements Interface {
  @Override
  public void fillingInfo(Information information) {
      for (int i = 0; i < 30; i++){
          getLogin().add("Bohdan" + i );
          getMail().add("Bohdan" + i + "@gmail.com");
          getUserInfo().put("Bohdan" + i + "@gmail.com", "Bohdan" + i);
      }
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");
      getLogin().add("Bohdan");

      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");
      getMail().add("Bohdan@gmail.com");

      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");
      getUserInfo().put("Bohdan@gmail.com", "Bohdan");

      return ;
  }
}