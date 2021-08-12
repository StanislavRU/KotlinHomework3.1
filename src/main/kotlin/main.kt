fun main() {
    var online = 50
    var toText = agoToText(online)
    println("был(а) в сети $toText")
}

fun agoToText(online: Int): String {
    return when (online) {
        in 0..60 -> "только что"
        in 61..3600 -> agoToTextMinutes(online)
        in 3601..86400 -> agoToTextHours(online)
        in 86401..172800 -> "сегодня"
        in 172801..259200 -> "вчера"
        else -> "давно"
    }
}

fun agoToTextMinutes(online: Int): String {
    var minutes = online/60
    return when {
        (minutes%10 == 1 && minutes%100 != 11) -> "$minutes минуту назад"
        (minutes%10 == 2 || minutes%10 == 3 || minutes%10 == 4) -> "$minutes минуты назад"
        else -> "$minutes минут назад"
    }
}

fun agoToTextHours(online: Int): String {
    var hours = online/3600
    return when {
        (hours%10 == 1 && hours%100 != 11) -> "$hours час назад"
        (hours%10 == 2 || hours%10 == 3 || hours%10 == 4) -> "$hours часа назад"
        else -> "$hours часов назад"
    }
}

