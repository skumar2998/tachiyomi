/*
 * Copyright (C) 2018 The Tachiyomi Open Source Project
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package tachiyomi.domain.library.repository

import java.io.File

interface LibraryCovers {

  fun find(mangaId: Long): File

  fun findCustom(mangaId: Long): File

  fun delete(mangaId: Long): Boolean

  fun deleteCustom(mangaId: Long): Boolean

}
