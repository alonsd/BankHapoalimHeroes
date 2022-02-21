package com.bankhapoalimheroes.data.repository

import com.bankhapoalimheroes.data.source.remote.source.hero.RemoteHeroDataSourceImp

class HeroesRepository(private val remoteHeroDataSourceImp: RemoteHeroDataSourceImp) {
    
    suspend fun getHeroesByNameWithSuggestions(name: String) =
        remoteHeroDataSourceImp.getHeroesByNameWithSuggestions(name)

    suspend fun getSuggestedHeroesList(addSeparation: Boolean) =
        remoteHeroDataSourceImp.getSuggestedHeroesList(addSeparation)

}

