public class Purchase implements Comparable <Purchase>{
    String name;
    Integer number;

    public Purchase (String name, Integer number){
        this.name = name;
        this.number = number;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Integer getNumber() {return number;}
    public void setNumber(Integer number) {this.number = number;}
    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }


//    @Override
//    public int compareTo(Purchase o) {
//        return this.number.compareTo(o.getNumber()) * -1;
//    }
    @Override
    public int compareTo(Purchase o) {
        return this.name.compareTo(o.getName());
    }

}
