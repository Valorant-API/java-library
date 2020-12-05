import com.thoo.api.ValorantApi

fun main(args: Array<String>) {
    val api = ValorantApi()
    /*val agents = api.getAgents()
    val budies = api.getBuddies()
    val cards = api.getCards()
    val contentTiers = api.getContentTiers()
    val currencies = api.getCurrencies()
    val gamemodes = api.getGamemodes()
    val gamemodeEquippable = api.getGamemodeEquippable()
    val maps = api.getMaps()
    val seasons = api.getSeasons()
    val themes = api.getThemes()
    val titles = api.getTitles()*/
    val weapons = api.getWeapons()
}