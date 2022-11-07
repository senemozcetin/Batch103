package day24statickeywordencapsulation;

public class Student {

    //Encapsulation : "Data Hiding(Gizlemek) " demektir
    // Data yi nicin gizlersiniz? Datayi dis etkenlerden korumak icin.
    // Data yi nasil gizlersin? Access modifier ini private yaparak gizlerim.
    // Data yi gizledikten sonra baska Class lardan okumak istersen ne yaparsin?
    //"get" methodlar(getter) olusturarak gizledigimiz data lari okunur hale getirebiliriz.
    // Data yi gizledikten sonra baska Class lardan degistirmek istersen ne yaparsin?
    // "set method" lar (setter)olusturarak gizledigimiz data lari degistirebiliriz.
    //variable in data type i ile get method un return type i ayni olmalidir
    //get methodlari isimlendirirken "get+ < variable name>" ancak variable in data tipi boolean ise "is+<variable name>"

    public String stdName= "Tom Hanks";
    private String stdId= "TH202201";
    private double gpa= 3.8;
    private boolean retired= false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
