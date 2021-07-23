public class Main {
    public String test = "";
    public int number = 0;


    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Main(String test, int number) {
        this.test = test;
        this.number = number;

        System.out.println("Hey, how are you ?");
    }
}
