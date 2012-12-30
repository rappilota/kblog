
package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Gate extends Controller {

    public static Result index() {
        return ok(index.render("Knowledge snippets"));
    }

    public static Result underConstruction() {
        return ok(views.html.countdown.render());
    }

}
