public class Student {

   String name;
   int idNumber;
   double GPA;
   int numTestsTaken;

//CONSTRUCTORS
   public Student() {
      name = "Unnamed";
      idNumber = 000000000;
      GPA = 4.0;
      numTestsTaken = 0;
   }

   public Student(String inputName, int inputIdNumber, double inputGPA, int inputNumTestsTaken) {
      name = inputName;
      idNumber = inputIdNumber;
      GPA = inputGPA;
      numTestsTaken = inputNumTestsTaken;
   }

//METHODS
   public takeTest() {
      numTestsTaken++; //same thing as saying numTestsTaken += 1 --> which is the same thing as numTestsTaken = numTestsTaken + 1;
   }

   public setGPA(int inputGPA) {
      //what we would want to do in this method?
   }

   public setName(what would we want to put in these parantheses?) {
      //what we would want to do in this method?
   }

}
