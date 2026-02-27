@file:OptIn(InternalResourceApi::class)

package kts_metaclass_hw2.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.LanguageQualifier
import org.jetbrains.compose.resources.ResourceContentHash
import org.jetbrains.compose.resources.ResourceItem
import org.jetbrains.compose.resources.StringResource

private const val MD: String = "composeResources/kts_metaclass_hw2.composeapp.generated.resources/"

@delegate:ResourceContentHash(882_417_370)
internal val Res.string.emailInputHint: StringResource by lazy {
      StringResource("string:emailInputHint", "emailInputHint", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 10, 50),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 10, 38),
      ))
    }

@delegate:ResourceContentHash(-927_481_434)
internal val Res.string.loginButtonString: StringResource by lazy {
      StringResource("string:loginButtonString", "loginButtonString", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 61, 41),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 49, 33),
      ))
    }

@delegate:ResourceContentHash(1_504_375_705)
internal val Res.string.loginWelcomeMsg1: StringResource by lazy {
      StringResource("string:loginWelcomeMsg1", "loginWelcomeMsg1", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 103, 60),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 83, 40),
      ))
    }

@delegate:ResourceContentHash(-460_276_865)
internal val Res.string.loginWelcomeMsg2: StringResource by lazy {
      StringResource("string:loginWelcomeMsg2", "loginWelcomeMsg2", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 164, 112),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 124, 48),
      ))
    }

@delegate:ResourceContentHash(-1_157_584_355)
internal val Res.string.passwordInputHint: StringResource by lazy {
      StringResource("string:passwordInputHint", "passwordInputHint", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 277, 61),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 173, 45),
      ))
    }

@delegate:ResourceContentHash(-1_672_271_924)
internal val Res.string.passwordRecoveryString: StringResource by lazy {
      StringResource("string:passwordRecoveryString", "passwordRecoveryString", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 339, 66),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 219, 54),
      ))
    }

@delegate:ResourceContentHash(69_264_673)
internal val Res.string.signUpOffer1: StringResource by lazy {
      StringResource("string:signUpOffer1", "signUpOffer1", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 406, 56),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 274, 52),
      ))
    }

@delegate:ResourceContentHash(-1_723_172_736)
internal val Res.string.signUpOffer2: StringResource by lazy {
      StringResource("string:signUpOffer2", "signUpOffer2", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 463, 68),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 327, 32),
      ))
    }

@delegate:ResourceContentHash(-218_782_152)
internal val Res.string.welcomeButtonMsg: StringResource by lazy {
      StringResource("string:welcomeButtonMsg", "welcomeButtonMsg", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 532, 40),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 360, 40),
      ))
    }

@delegate:ResourceContentHash(-907_162_622)
internal val Res.string.welcomeImageUrl: StringResource by lazy {
      StringResource("string:welcomeImageUrl", "welcomeImageUrl", setOf(
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 401, 151),
      ))
    }

@delegate:ResourceContentHash(150_465_518)
internal val Res.string.welcomeMsg: StringResource by lazy {
      StringResource("string:welcomeMsg", "welcomeMsg", setOf(
        ResourceItem(setOf(LanguageQualifier("ru"), ), "${MD}values-ru/strings.commonMain.cvr", 573, 62),
        ResourceItem(setOf(), "${MD}values/strings.commonMain.cvr", 553, 30),
      ))
    }

@InternalResourceApi
internal fun _collectCommonMainString0Resources(map: MutableMap<String, StringResource>) {
  map.put("emailInputHint", Res.string.emailInputHint)
  map.put("loginButtonString", Res.string.loginButtonString)
  map.put("loginWelcomeMsg1", Res.string.loginWelcomeMsg1)
  map.put("loginWelcomeMsg2", Res.string.loginWelcomeMsg2)
  map.put("passwordInputHint", Res.string.passwordInputHint)
  map.put("passwordRecoveryString", Res.string.passwordRecoveryString)
  map.put("signUpOffer1", Res.string.signUpOffer1)
  map.put("signUpOffer2", Res.string.signUpOffer2)
  map.put("welcomeButtonMsg", Res.string.welcomeButtonMsg)
  map.put("welcomeImageUrl", Res.string.welcomeImageUrl)
  map.put("welcomeMsg", Res.string.welcomeMsg)
}
