package controllers

import play.api.mvc._
import javax.inject._
import java.rmi.dgc.VMID

class ApplicationController @Inject() extends Controller {
  def index = Action {
    Ok(s"Hello World from ${new VMID().toString.take(10)}")
  }
}
