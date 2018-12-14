public class ThisIsACryForHelp {
    private String[] data;

    public ThisIsACryForHelp(String[] data) {
        this.data = data;
    }

    public String getThing(int num) {
        return data[num];
    }

    public int size() {
        return data.length;
    }
}
