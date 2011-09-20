/*
 * Copyright (C) 2011 Mert Dönmez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package m3r7.android.vibrator;

public interface ICommand {

	void execute();

	String getName();

	String getDescription();

	Type getType();

	enum Type {
		BASE(-1), START(0), STOP(1), DEC_FREQ(2), INC_FREQ(3), SELECT(4), DISABLE(
				5);
		/**
		 * resourceArrayIndex is the corresponding index in
		 * R.array.command_names
		 */
		public final int resourceArrayIndex;

		private Type(int index) {
			this.resourceArrayIndex = index;
		}
	}

}