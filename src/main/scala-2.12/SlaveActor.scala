import java.io.File

import communication.AlarmMessage
import akka.actor.TypedActor.Receiver
import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory


/**
  * Created by hc2twv on 14/12/16.
  */

class SlaveActor extends Actor{
    def receive: Receive = {
      case msj: AlarmMessage => {
        println("This is an alert message: " + msj + " from " + sender)
      }
      case _ => println("Received unknown msg ")
    }
}


