package com.example.app

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraServlet extends IntellijscalatrasessionhighlighterrorStack {

  get("/") {
    session("bleh") = 5 //Highlighting error here
  }
  
}
