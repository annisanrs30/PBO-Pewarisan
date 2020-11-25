public class main {
        public static void main(String[] args) {
        tim secretnumber = new tim("Secret Number");
        

        member m1 = new member("Lea", 25);
        member m2 = new member("Dita", 24);
        member m3 = new member("Jinny", 22);

        trainee t1 = new trainee("Soodam", 21, 3);
        trainee t2 = new trainee("Denise", 19, 5);

        secretnumber.addmember(m1); 
        secretnumber.addmember(m2);
        secretnumber.addmember(m3);

        secretnumber.addmember(t1);
        secretnumber.addmember(t2);

        System.out.println("Full Member:");
        secretnumber.displayfullmember();
        System.out.println("\nTrainee");
        secretnumber.displaytrainee();    
        }
    }