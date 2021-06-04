package de.dertyp7214.rboardthememanager.viewmodels

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import de.dertyp7214.rboardthememanager.data.ThemeDataClass
import de.dertyp7214.rboardthememanager.data.ThemePack

class ThemesViewModel : ViewModel() {
    private val selectedTheme = MutableLiveData<ThemeDataClass?>()
    private val themePacks = MutableLiveData<List<ThemePack>>()
    private val themes = MutableLiveData<List<ThemeDataClass>>()
    private val filter = MutableLiveData<String>()
    private val clearSearch = MutableLiveData<String>()

    fun getSelectedTheme(): ThemeDataClass? {
        return selectedTheme.value
    }

    fun setSelectedTheme(theme: ThemeDataClass? = null) {
        selectedTheme.value = theme
    }

    fun observerSelectedTheme(owner: LifecycleOwner, observer: Observer<ThemeDataClass?>) {
        selectedTheme.observe(owner, observer)
    }

    fun getThemePacks(): List<ThemePack> {
        return themePacks.value ?: listOf()
    }

    fun setThemePacks(list: List<ThemePack>) {
        themePacks.value = list
    }

    fun themePacksObserve(owner: LifecycleOwner, observer: Observer<List<ThemePack>>) {
        themePacks.observe(owner, observer)
    }

    fun getThemes(): List<ThemeDataClass> {
        return themes.value ?: listOf()
    }

    fun setThemes(list: List<ThemeDataClass>) {
        themes.value = list
    }

    fun themesObserve(owner: LifecycleOwner, observer: Observer<List<ThemeDataClass>>) {
        themes.observe(owner, observer)
    }

    fun getFilter(): String {
        return filter.value ?: ""
    }

    fun setFilter(f: String = "") {
        filter.value = f
    }

    fun observeFilter(owner: LifecycleOwner, observer: Observer<String>) {
        filter.observe(owner, observer)
    }

    fun clearSearch() {
        clearSearch.value = ""
    }

    fun onClearSearch(owner: LifecycleOwner, observer: Observer<String>) {
        clearSearch.observe(owner, observer)
    }
}