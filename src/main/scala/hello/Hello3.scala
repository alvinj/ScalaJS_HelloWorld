package hello

import org.scalajs.dom
import dom.document
import scalatags.JsDom.all._

object Hello3 {

    def main(args: Array[String]): Unit = {

        val btn = button(
            "Click me",
            onclick := { () =>
                dom.window.alert("Hello, world")
        })

        // intentional overkill
        val content =
            div(cls := "main-div",
                div(cls := "foo",
                    h2("Hello"),
                    btn
                )
            )

        val root = dom.document.getElementById("root")
        root.innerHTML = ""
        root.appendChild(content.render)

    }

}



