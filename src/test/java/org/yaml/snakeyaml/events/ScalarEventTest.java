/**
 * Copyright (c) 2008, SnakeYAML
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.yaml.snakeyaml.events;

import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;
import org.yaml.snakeyaml.DumperOptions;

public class ScalarEventTest extends TestCase {

  public void testToString() {
    ScalarEvent event = new ScalarEvent("a2", "str", new ImplicitTuple(true, true), "text", null,
        null, DumperOptions.ScalarStyle.DOUBLE_QUOTED);
    assertEquals(
        "<org.yaml.snakeyaml.events.ScalarEvent(anchor=a2, tag=str, style=Scalar style: '\"',implicit=[true, true], value=text)>",
        event.toString());
  }

  public void testNotEqual() {
    ScalarEvent event = new ScalarEvent("a2", "str", new ImplicitTuple(true, true), "text", null,
        null, DumperOptions.ScalarStyle.DOUBLE_QUOTED);
    assertNotEquals(event, event.toString());
  }
}
