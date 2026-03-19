package com.calypso.assembly;

@FunctionalInterface
public interface AssemblyRule {
    void apply(AssemblyContext context, AssemblyComputation computation);
}
