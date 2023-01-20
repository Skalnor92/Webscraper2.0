import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main( String[] args ) {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setPrintContentOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        try {
            HtmlPage page = webClient.getPage("https://foodnetwork.co.uk/italian-family-dinners/");

            webClient.getCurrentWindow().getJobManager().removeAllJobs();
            webClient.close();
            ///recipesFile.close();
            String title = page.getTitleText();
            System.out.println("Page Title: " + title);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
        System.out.print("Hello World");
    }
}