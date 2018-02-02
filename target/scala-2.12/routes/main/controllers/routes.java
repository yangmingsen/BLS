
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/seed/conf/routes
// @DATE:Fri Feb 02 11:08:54 CST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplications Applications = new controllers.ReverseApplications(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplications Applications = new controllers.javascript.ReverseApplications(RoutesPrefix.byNamePrefix());
  }

}
