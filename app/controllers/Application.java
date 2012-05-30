package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void viewResults(){
    	render();
    }
    
    public static void tio(){
    	//should open popup with the image
    	
    	render();
    }
    
    public static void tryitonwindow(){
    	
    	redirect("http://www.ebay.com");
    }
    
    public static void save(){
    	
    	//add stuff to local db
    	viewResults();
    }
    
  
}