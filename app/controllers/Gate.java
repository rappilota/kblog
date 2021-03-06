
package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Gate extends Controller {

    public static Result index() {
        return ok(views.html.index.render("Knowledge snippets"));
    }

    public static Result underConstruction() {
        return ok(views.html.countdown.render());
    }

    public static Result about() {
        return ok(views.html.about.render());
    }

    public static Result posts() {
        return ok(views.html.posts.render());
    }
}
