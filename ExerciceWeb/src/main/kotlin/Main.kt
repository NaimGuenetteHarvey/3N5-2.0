package org.example
import com.sun.tools.javac.tree.TreeInfo.args
import org.jsoup.Jsoup
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val url = args[0]
    val doc = Jsoup.connect(url).get()
    println(doc)
}