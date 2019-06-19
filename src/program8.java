enum program8 {
    small,medium,large,extralarge,ultrasmall
}
class Main {
    public static void main(String args[]){
        program8 c=program8.small;
        switch(c) {
            case small:
                System.out.println("You choose small");
                break;
            case medium:
                System.out.println("You choose medium ");
                break;
            case large:
                System.out.println("You choose large");
                break;
            case extralarge:
                System.out.println("You choose extralarge");
                break;
            case ultrasmall:
                System.out.println("You choose ultrasmall");
                break;
            default:
                System.out.println("not choosen the size");
                break;
        }
    }
}
