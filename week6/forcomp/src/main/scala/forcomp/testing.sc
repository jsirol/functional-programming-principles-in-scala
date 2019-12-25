import forcomp.Anagrams
val ana = Anagrams
val l = "Johannes"

l.toLowerCase.groupBy(x => x).toList.map(x => (x._1, x._2.length)).toMap

l.toLowerCase.groupBy(x => x).map(x => (x._1, x._2.length)).toList


val wl = List("Johannes", "on", "kiva")

wl.flatMap(x => x.toUpperCase)

wl.foldLeft("")(_+_)
wl.foldRight("")(_+_)
wl.reduce(_+_)
wl.reduceLeft(_+_)

wl.mkString


ana.combinations(List(('a',2), ('b', 2)))

val la = (List(('a',2), ('b', 2))).toMap

val lb = (List(('a', 1))).toMap


ana.sentenceAnagrams(List("yes", "man"))


