public class Televisor {
    boolean status;

    Televisor(boolean status){
        this.status = status;
    }

    void turnOn(){
        status = true;
    }

    void turnOff(){
        status = false;
    }

    void showStatus(){
        if (status == true){
        System.out.println("Telewizor jest włączony.");
    }
    else{
            System.out.println("Telewizor jest wyłączony.");
        }
        }


}
