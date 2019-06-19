package hello

import org.scalajs.dom
//import dom.document
import org.querki.jquery._

object Hello2 {

    def main(args: Array[String]): Unit = {

        // handle the login button click
        $("#hello-button").click{() =>
            dom.window.alert("Hello, world")
        }
    }

}


