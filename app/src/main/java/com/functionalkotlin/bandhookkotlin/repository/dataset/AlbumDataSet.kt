// Copyright © FunctionalKotlin.com 2018. All rights reserved.

package com.functionalkotlin.bandhookkotlin.repository.dataset

import com.functionalkotlin.bandhookkotlin.domain.entity.Album
import com.functionalkotlin.bandhookkotlin.domain.entity.AlbumNotFound
import com.functionalkotlin.bandhookkotlin.functional.AsyncResult

interface AlbumDataSet {

    fun requestTopAlbums(artistId: String): List<Album>
    fun requestAlbum(mbid: String): AsyncResult<Album, AlbumNotFound>

}
