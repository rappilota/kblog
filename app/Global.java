


import play.GlobalSettings;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;
import play.mvc.Results;

public class Global extends GlobalSettings {

    @Override
    public Result onHandlerNotFound(RequestHeader arg0) {
        return Results.notFound(views.html.pageNotFound.render());
    }

}
