package CJ3;
public class Break {
public static void main(String[] args) {
    //String[] days={"Monday","Tuesday","Wednesday","Sunday"};
    String[] days={"Monday","Tuesday","Wednesday"};
    for(int i=0;i<days.length;i++){
        if(days[i] == "Sunday") {
            System.out.println("Holiday");
            break;
        }
        else{
            System.out.println("No holiday");
        }

        

    }
}
}
