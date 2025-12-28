import java.util.Scanner;

  class loginthread extends Thread{
    static Scanner sc = new Scanner(System.in);
       static String [] userid = {"pardeep","balkaran"};
       static String [] password = {"123","456"};
       String user_find_id,user_find_pass;
       boolean found = false;
        @Override
        public  void run(){
            try {


            System.out.println("---------------------Login--------------------------\n\n");
            System.out.print("Enter Your ID: ");
            user_find_id = sc.next();
            System.out.print("Enter Your Password: ");
            user_find_pass = sc.next();


            for(int i=0;i<2;i++){
                if(userid[i].equals(user_find_id) && password[i].equals( user_find_pass) ){
                    found = true;
                    break;
                }


            }
            if(found){
                System.out.println("\nLogin Successful ✅");
                System.out.println("Loading Quiz...");
                Thread.sleep(2000);   // ⏳ LOGIN → QUIZ DELAY
                quiz quizthread = new quiz();
                quizthread.start();
            }
            else{
                System.out.println("Invalid User ❌");
            }

            }
            catch (InterruptedException e){
                System.out.println(e);
            }
    }
}

class quiz extends Thread{
    static Scanner sc = new Scanner(System.in);
     static int score=0,r_score=10;
     static   int ans1=2,ans2=3,ans3=2,ans4=4,ans5=3,ans6=3,ans7=2,ans8=2,ans9=4,ans10=3;
     static int answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10;
     static String [] q1_option  = {"Kanaihya Misl","Ahluwalia Misl","Ramgarhia Misl"," Sukerchakia Misl"};
     static  String [] q2_option = {"Beas River","Ghaggar River","Sutlej River","Yamuna River"};
    static String [] q3_option = {"Amrita Pritam","Sadhu Singh Hamdard","Bhagat Singh","Surjit Patar"};
    static String [] q4_option = {"Shakuntala Choudhary","Durgabai Kamat","Basanti Devi","Satyavati Devi"};
    static String [] q5_option = {"Guru Nanak Dev Ji","Guru Tegh Bahadur Ji"," Guru Gobind Singh Ji","Guru Arjan Dev Ji"};
    static String [] q6_option = {"Bhai Kahn Singh Nabha","Giani Gain Singh","Pandit Tara Singh Narotam","Bishan Singh Ji Muralewale"};
    static String [] q7_option = {"Guru Nanak Dev Ji","Guru Hargobind Ji","Guru Gobind Singh Ji","Guru Arjan Dev Ji"};
    static String [] q8_option = {"Amritsar","Nanded","Patiala"," Bathinda"};
    static String [] q9_option = {"Banabhatta","Kalidasa","Amir Khusrau"," Saraha"};
    static String [] q10_option = {"Maharaja Ranjit Singh","Maharaja Duleep Singh","Maharaja Narinder Singh"," Maharaja Sher Singh"};
          @Override
          public  void run() {
              try {


              System.out.println("\n1.Kapurthala State was formed by territories of which Sikh misl in Punjab?\n");
              for (int i = 0; i < q1_option.length; i++) {
                  System.out.println((i + 1) + ". " + q1_option[i] + "\n");
              }
              System.out.print("Choose Your Answer: ");
              answer1 = sc.nextInt();
              if (answer1 == ans1) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n2.Ropar Wetland in Punjab is located on which river?\n");
                  for (int i = 0; i < q2_option.length; i++) {
                      System.out.println((i + 1) + ". " + q2_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer2 = sc.nextInt();
                  Thread.sleep(1500);   // ⏳ NEXT QUESTION DELAY
              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer1 + " Right Answer is: " + " Ahluwalia Misl\n");
                  System.out.println("\n2.Ropar Wetland in Punjab is located on which river?\n");
                  for (int i = 0; i < q2_option.length; i++) {
                      System.out.println((i + 1) + ". " + q2_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer2 = sc.nextInt();
                  Thread.sleep(1500);   // ⏳ NEXT QUESTION DELAY
              }
              if (answer2 == ans2) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n3.Who revolutionized Punjabi journalism by editing Urdu Daily Ajit and Punjabi Ajit?\n");
                  for (int i = 0; i < q3_option.length; i++) {
                      System.out.println((i + 1) + ". " + q3_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer3 = sc.nextInt();
                  Thread.sleep(1500);   // ⏳ NEXT QUESTION DELAY
              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer2 + " Right Answer is: " + " Sutlej River\n");
                  System.out.println("\n3.Who revolutionized Punjabi journalism by editing Urdu Daily Ajit and Punjabi Ajit?\n");
                  for (int i = 0; i < q3_option.length; i++) {
                      System.out.println((i + 1) + ". " + q3_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer3 = sc.nextInt();
                  Thread.sleep(1500);   // ⏳ NEXT QUESTION DELAY
              }

              if (answer3 == ans3) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n4.Identify the woman freedom fighter from Punjab based on the following facts:\n" +
                          "She was arrested in 1942 during the Quit India Movement and hoisted the tricolour in Lahore Jail.\n" +
                          "She was the mother of India’s former Vice President, Krishan Kant.\n" +
                          "Her daughter Subhadra was the youngest arrested freedom fighter at the age of 13.\n");
                  for (int i = 0; i < q4_option.length; i++) {
                      System.out.println((i + 1) + ". " + q4_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer4 = sc.nextInt();
                  Thread.sleep(1500);   // ⏳ NEXT QUESTION DELAY
              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer3 + " Right Answer is: " + " Sadhu Singh Hamdard\n");

                  System.out.println("\n4.Identify the woman freedom fighter from Punjab based on the following facts:\n" +
                          "She was arrested in 1942 during the Quit India Movement and hoisted the tricolour in Lahore Jail.\n" +
                          "She was the mother of India’s former Vice President, Krishan Kant.\n" +
                          "Her daughter Subhadra was the youngest arrested freedom fighter at the age of 13.\n");
                  for (int i = 0; i < q4_option.length; i++) {
                      System.out.println((i + 1) + ". " + q4_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer4 = sc.nextInt();
                  Thread.sleep(1000);   // ⏳ NEXT QUESTION DELAY
              }

              if (answer4 == ans4) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n5.Who is traditionally credited with composing the Sikh prayer Ardās?\n");
                  for (int i = 0; i < q5_option.length; i++) {
                      System.out.println((i + 1) + ". " + q5_option[i] + "\n");
                  }

                  System.out.print("Choose Your Answer: ");
                  answer5 = sc.nextInt();
                  Thread.sleep(1000);   // ⏳ NEXT QUESTION DELAY

              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer4 + " Right Answer is: " + " Satyavati Devi\n");
                  System.out.println("\n5.Who is traditionally credited with composing the Sikh prayer Ardās?\n");
                  for (int i = 0; i < q5_option.length; i++) {
                      System.out.println((i + 1) + ". " + q5_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer5 = sc.nextInt();
                  Thread.sleep(1000);   // ⏳ NEXT QUESTION DELAY
              }

              if (answer5 == ans5) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n6.Which Sikh Nirmala scholar from Kahlwan was patronized by Maharaja Narinder Singh?\n");
                  for (int i = 0; i < q6_option.length; i++) {
                      System.out.println((i + 1) + ". " + q6_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer6 = sc.nextInt();
                  Thread.sleep(1000);   // ⏳ NEXT QUESTION DELAY

              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer5 + " Right Answer is: " + " Guru Gobind Singh Ji\n");
                  System.out.println("\n6.Which Sikh Nirmala scholar from Kahlwan was patronized by Maharaja Narinder Singh?\n");
                  for (int i = 0; i < q6_option.length; i++) {
                      System.out.println((i + 1) + ". " + q6_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer6 = sc.nextInt();
                  Thread.sleep(1000);
              }

              if (answer6 == ans6) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n7.Which Sikh Guru’s Chola is preserved in Ludhiana, Punjab?\n");
                  for (int i = 0; i < q7_option.length; i++) {
                      System.out.println((i + 1) + ". " + q7_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer7 = sc.nextInt();
                  Thread.sleep(1000);
              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer6 + " Right Answer is: " + " Pandit Tara Singh Narotam\n");
                  System.out.println("\n7.Which Sikh Guru’s Chola is preserved in Ludhiana, Punjab?\n");
                  for (int i = 0; i < q7_option.length; i++) {
                      System.out.println((i + 1) + ". " + q7_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer7 = sc.nextInt();
                  Thread.sleep(1000);
              }
              if (answer7 == ans7) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n8.Where did Guru Gobind Singh declare Adi Granth as the eternal Guru?\n");
                  for (int i = 0; i < q8_option.length; i++) {
                      System.out.println((i + 1) + ". " + q8_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer8 = sc.nextInt();
                  Thread.sleep(1000);
              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer7 + " Right Answer is: " + "Guru Hargobind Ji\n");
                  System.out.println("\n8.Where did Guru Gobind Singh declare Adi Granth as the eternal Guru?\n");
                  for (int i = 0; i < q8_option.length; i++) {
                      System.out.println((i + 1) + ". " + q8_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer8 = sc.nextInt();
                  Thread.sleep(1000);
              }

              if (answer8 == ans8) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n9.Who authored the Apabhramsa poem Akhara Bāḍhā Sa’ala Jagu?\n");
                  for (int i = 0; i < q9_option.length; i++) {
                      System.out.println((i + 1) + ". " + q9_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer9 = sc.nextInt();
                  Thread.sleep(1000);
              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer8 + " Right Answer is: " + "Nanded\n");
                  System.out.println("\n9.Who authored the Apabhramsa poem Akhara Bāḍhā Sa’ala Jagu?\n");
                  for (int i = 0; i < q9_option.length; i++) {
                      System.out.println((i + 1) + ". " + q9_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer9 = sc.nextInt();
                  Thread.sleep(1000);
              }

              if (answer9 == ans9) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\n10.Who sponsored the historical works of Sikh historian Giani Gian Singh?\n");
                  for (int i = 0; i < q10_option.length; i++) {
                      System.out.println((i + 1) + ". " + q10_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer10 = sc.nextInt();
                  Thread.sleep(1000);
              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer9 + " Right Answer is: " + "Saraha\n");
                  System.out.println("\n10.Who sponsored the historical works of Sikh historian Giani Gian Singh?\n");
                  for (int i = 0; i < q10_option.length; i++) {
                      System.out.println((i + 1) + ". " + q10_option[i] + "\n");
                  }
                  System.out.print("Choose Your Answer: ");
                  answer10 = sc.nextInt();
                  Thread.sleep(1000);
              }

              if (answer10 == ans10) {
                  score++;
                  System.out.println("Answer is Correct !\n");
                  System.out.println("\nCalculating Result...");
                  Thread.sleep(1000);
                  System.out.println("\n🎯 FINAL SCORE: " + score + "/" + r_score);

              } else {
                  System.out.println("Wrong Answer !");
                  System.out.println("You Choose " + answer10 + " Right Answer is: " + "Maharaja Narinder Singh\n");
                  System.out.println("\nCalculating Result...");
                  Thread.sleep(1000);

                  System.out.println("\n🎯 FINAL SCORE: " + score + "/" + r_score);
              }
          }
              catch(InterruptedException e){
                  System.out.println(e);
              }
       }
  }




class Main {

    public static void main(String[] args) {
        loginthread gamestart = new loginthread();
        gamestart.start();
    }
}
