package tachiyomi.data.manga.util

import tachiyomi.domain.manga.model.Manga
import tachiyomi.domain.source.model.SManga

internal fun SManga.asDbManga(sourceId: Long): Manga {
  return Manga(
    id = -1,
    source = sourceId,
    key = key,
    title = title,
    artist = artist,
    author = author,
    description = description,
    genres = genres,
    status = status,
    cover = cover,
    initialized = initialized,
    favorite = false,
    lastUpdate = 0,
    viewer = 0,
    flags = 0
  )
}
