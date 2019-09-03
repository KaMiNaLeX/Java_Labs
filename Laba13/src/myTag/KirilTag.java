package myTag;


        import javax.servlet.jsp.tagext.*;
        import javax.servlet.jsp.JspWriter;
        import javax.servlet.jsp.JspException;
        import java.io.IOException;

public class KirilTag extends TagSupport {

    public String value = "";
    public String label = "";
    public String name = "";



    public void setName(String name) {
        this.name = name;
    }



}