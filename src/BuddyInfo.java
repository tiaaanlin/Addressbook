public class BuddyInfo {// this class is for creating a buddy object
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Tian");
        System.out.println("Hello, "+buddy.getName());
    }

}
