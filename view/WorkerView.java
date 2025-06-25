package view;

public class WorkerView {
    //declear
    private String header;
    private String body;

    //getter and setter
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void display(){
        System.out.println(header);
        System.out.println(body);
    }
}
