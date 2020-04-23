/**
 * Designed and developed by Andrea Cioccarelli (@cioccarellia)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cioccarellia.kspref.transform

import com.cioccarellia.kspref.const.Constants
import java.math.BigInteger

class BigIntConverter : TypeConverter<BigInteger>() {
    override fun transform(value: BigInteger) = value.toByteArray()!!
    override fun reify(value: ByteArray) = value.toString(Constants.CHARSET).toBigInteger()
}