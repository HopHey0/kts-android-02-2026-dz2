@file:OptIn(InternalResourceApi::class)

package kts_metaclass_hw2.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.ResourceContentHash
import org.jetbrains.compose.resources.ResourceItem

private const val MD: String = "composeResources/kts_metaclass_hw2.composeapp.generated.resources/"

@delegate:ResourceContentHash(379_089_144)
internal val Res.drawable.compose_multiplatform: DrawableResource by lazy {
      DrawableResource("drawable:compose_multiplatform", setOf(
        ResourceItem(setOf(), "${MD}drawable/compose-multiplatform.xml", -1, -1),
      ))
    }

@delegate:ResourceContentHash(597_836_406)
internal val Res.drawable.load_error: DrawableResource by lazy {
      DrawableResource("drawable:load_error", setOf(
        ResourceItem(setOf(), "${MD}drawable/load_error.xml", -1, -1),
      ))
    }

@delegate:ResourceContentHash(1_082_636_591)
internal val Res.drawable.load_placeholder: DrawableResource by lazy {
      DrawableResource("drawable:load_placeholder", setOf(
        ResourceItem(setOf(), "${MD}drawable/load_placeholder.xml", -1, -1),
      ))
    }

@delegate:ResourceContentHash(2_135_221_405)
internal val Res.drawable.visibility: DrawableResource by lazy {
      DrawableResource("drawable:visibility", setOf(
        ResourceItem(setOf(), "${MD}drawable/visibility.xml", -1, -1),
      ))
    }

@delegate:ResourceContentHash(379_713_625)
internal val Res.drawable.visibilityoff: DrawableResource by lazy {
      DrawableResource("drawable:visibilityoff", setOf(
        ResourceItem(setOf(), "${MD}drawable/visibilityoff.xml", -1, -1),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("compose_multiplatform", Res.drawable.compose_multiplatform)
  map.put("load_error", Res.drawable.load_error)
  map.put("load_placeholder", Res.drawable.load_placeholder)
  map.put("visibility", Res.drawable.visibility)
  map.put("visibilityoff", Res.drawable.visibilityoff)
}
