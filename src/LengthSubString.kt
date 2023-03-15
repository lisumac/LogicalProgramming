class LengthSubString {
    val stringss ="abcCde"
      fun   lenthSubString(stringss:String){
        var start =0
        var end =0
        var max =0
        val characters = HashSet<Char>()
        while(start< stringss.length){
            if (!characters.contains(stringss[end])){
               characters.add(stringss.get(end))
                start++;
                end--
            } else {
                characters.remove(stringss.get(end))
                start--;
                end++
            }
        }

    }

    fun main(){

    }
}