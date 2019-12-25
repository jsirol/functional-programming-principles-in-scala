import patmat.Huffman

val a = Huffman

val msg = a.decodedSecret


val tree = a.frenchCode
val s = a.quickEncode(tree)(msg)
val s2 = a.encode(tree)(msg)
a.secret
