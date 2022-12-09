package com.danil.navigation.ui.repository

import com.danil.navigation.R
import com.danil.navigation.ui.model.MainModel

class ModelRepository {

    private val listModelData = arrayListOf<MainModel>()

    fun getListModelData(): ArrayList<MainModel> {
        listModelData.add(
            MainModel(
                "Minecraft",
                "https://image.api.playstation.com/vulcan/img/cfn/11307uYG0CXzRuA9aryByTHYrQLFz-HVQ3VVl7aAysxK15HMpqjkAIcC_R5vdfZt52hAXQNHoYhSuoSq_46_MT_tDBcLu49I.png"
            )
        )
        listModelData.add(
            MainModel(
                "NFS Most Wondet",
                "https://upload.wikimedia.org/wikipedia/ru/thumb/1/15/NFS-Most-Wanted-Front.jpg/274px-NFS-Most-Wanted-Front.jpg"
            )
        )
        listModelData.add(
            MainModel(
                "cs:go",
                "https://sportyakutia.ru/images/1fotoposel/1posel2022/may22/CSGO_Tournaments_2.jpg"
            )
        )
        listModelData.add(
            MainModel(
                "Free Fire",
                "https://play-lh.googleusercontent.com/PLpZIB7zBE3PpD1DMajsUzksJHlPFGTpQJv8zwnbY1bqIGKxeqWzZdWbxJ4YpD0Hhhs"
            )
        )
        listModelData.add(
            MainModel(
                "PUBG",
                "https://play-lh.googleusercontent.com/PLpZIB7zBE3PpD1DMajsUzksJHlPFGTpQJv8zwnbY1bqIGKxeqWzZdWbxJ4YpD0Hhhs"
            )
        )
        return listModelData
    }
}
