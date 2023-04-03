class generic<S,R>{
    private S section;
    private R rollNo;

    public generic(S section,R rollNo){
        this.section=section;
        this.rollNo=rollNo;
    }
    public S getSection(){
        return section;

}public R getRollNo(){
        return rollNo;
    }
}
enum sections{
    SECTION1,SECTION2,SECTION3
}

public class Main {
    public static void main(String[] args) {
        generic<sections,String> obj=new generic<>(sections.SECTION1,"21SW100");
        sections sec=obj.getSection();
        String roll=obj.getRollNo();
        for(int i=0;i<10;i++){
        System.out.println("("+sec+","+roll+")");
    }}
}
