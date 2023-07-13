public class quizone {
    public static void main(String[] args) {
        student p1 = new student();
        p1.SetID(0,65022319);
        p1.SetName("0","jing");
        p1.SetYear(0,2023);
        p1.SetGPA(0,4.0);
        p1.ShowDetails();

    }
}
class student {
    private int ID;
    private String Name;
    private int addmissionYear;
    private double GPA;

    public void SetID(int ID,int newID){
        if(ID == 0){
            this.ID = newID;
        }else{
            System.out.println();
        }
    }
    public void SetName(String Name,String NewName){
        if(Name == "0"){
            this.Name = NewName;
        }else{
            System.out.println();
        }
    }
    public void SetYear(int addmissionYear,int NewYear){
        if(addmissionYear == 0){
            this.addmissionYear = NewYear;
        }else{
            System.out.println();
        }
    }
    public void SetGPA(double GPA,double NewGPA){
        if(GPA == 0){
            this.GPA = NewGPA;
        }else{
            System.out.println();
        }
    }


    public void ShowDetails(){
        System.out.println("ID : "+ this.ID);
        System.out.println("Name : "+ this.Name);
        System.out.println("addmissionYear : "+ this.addmissionYear);
        System.out.println("GPA : "+ this.GPA);
    }
}