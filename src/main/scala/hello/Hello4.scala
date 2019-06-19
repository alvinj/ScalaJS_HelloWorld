package hello

import org.scalajs.dom
import dom.document
import scalatags.JsDom.all._
import scala.scalajs.js.annotation.JSExportTopLevel

object Hello4 {

    def main(args: Array[String]): Unit = {

        // hrefs
        val link1 = a(href:="#", onclick:="handleClick(1)")(p("Page 1"))
        val link2 = a(href:="#", onclick:="handleClick(2)")(p("Page 2"))
        val link3 = a(href:="#", onclick:="handleClick(3)")(p("Page 3"))

        // should handle this style with a css page, not here
        val listOfLinks = ul(
            li(link1, style:="display: inline;"),
            li(link2, style:="display: inline;"),
            li(link3, style:="display: inline;")
        )

        val content =
            div(id := "main-div",
                h1(style:= "color: blue;", "Page 1"),
                listOfLinks
            )

        val root = dom.document.getElementById("root")
        root.innerHTML = ""
        root.appendChild(content.render)

    }

    @JSExportTopLevel("handleClick")
    def gotAClick(i: Int): Unit = {
        val s = s"gotAClick called with $i"
        dom.window.alert(s)
        //println(s)
    }

}



