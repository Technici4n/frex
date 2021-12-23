/*
 * This file is part of FREX and is licensed to the project under
 * terms that are compatible with the GNU Lesser General Public License.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership and licensing.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.vram.frex.impl.material.predicate;

import java.util.function.BiPredicate;

import net.minecraft.world.level.block.state.BlockState;

import io.vram.frex.api.material.RenderMaterial;

public abstract class StateBiPredicate implements BiPredicate<BlockState, RenderMaterial> {
	public static StateBiPredicate BLOCK_ALWAYS_TRUE = new StateBiPredicate() {
		@Override
		public boolean test(BlockState blockState, RenderMaterial renderMaterial) {
			return true;
		}

		@Override
		public boolean equals(Object obj) {
			return obj == BLOCK_ALWAYS_TRUE;
		}
	};

	@Override
	public abstract boolean equals(Object obj);
}
