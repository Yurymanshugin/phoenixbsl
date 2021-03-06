package com.github.otymko.phoenixbsl.logic.lsp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BSLConfiguration {
  private String language;
  private CodeLensOptions codeLens;
  private DiagnosticsOptions diagnostics;
  private String traceLog;
  private String configurationRoot;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class CodeLensOptions {
    private boolean showCognitiveComplexity = false;
    private boolean showCyclomaticComplexity = false;
  }

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class DiagnosticsOptions {
    private String computeTrigger = "onSave";
    private String skipSupport = "never";
  }

}
