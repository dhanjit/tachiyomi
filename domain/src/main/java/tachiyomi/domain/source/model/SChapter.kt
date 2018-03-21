package tachiyomi.domain.source.model

data class SChapter(
  var key: String,
  var name: String,
  var date_upload: Long,
  var number: Float = -1f,
  var scanlator: String = ""
)
