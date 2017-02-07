import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory
/**
  * Created by hc2twv on 15/12/16.
  */
object Slave extends App{
  val system = ActorSystem("Sys", ConfigFactory.load("application"))
  system.actorOf(Props[SlaveActor], "slave")

}
